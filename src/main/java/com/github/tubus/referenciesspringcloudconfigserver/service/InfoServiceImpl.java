package com.github.tubus.referenciesspringcloudconfigserver.service;

import com.github.tubus.referenciesspringcloudconfigserver.dto.InfoResponse;
import com.github.tubus.referenciesspringcloudconfigserver.dto.info.UserInfoDTO;
import com.github.tubus.referenciesspringcloudconfigserver.service.interfaces.InfoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneOffset;

@Service
public class InfoServiceImpl implements InfoService {

    @Resource
    @Qualifier("infodb")
    JdbcTemplate jdbcTemplate;

    @Override
    public InfoResponse getInfo() {
        InfoResponse response = new InfoResponse();
        response.setDescription("referencies-spring-cloud-config-server");
        return response;
    }

    @Override
    public void createUserInfo(UserInfoDTO userInfoDTO) throws Exception {
        createUserInfoInDb(userInfoDTO);
    }

    private void createUserInfoInDb(final UserInfoDTO userInfoDTO) throws Exception {

        String sql = "INSERT " +
            "into userInfo (id, name, phone, company_id, phone_number, timestamp_, description, payload) \n" +
            "values (?,?,?,?,?,?,?,?);";


        jdbcTemplate.execute(sql, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                Timestamp timestamp;
                if (userInfoDTO.getTime() != null) {
                    timestamp = Timestamp.from(userInfoDTO.getTime().toInstant(ZoneOffset.UTC));
                } else {
                    timestamp = Timestamp.from(Instant.now());
                }

                ps.setLong(1, userInfoDTO.getId());
                ps.setString(2, userInfoDTO.getName());
                ps.setLong(3, userInfoDTO.getPhone());
                ps.setInt(4, userInfoDTO.getCompany());
                ps.setString(5, userInfoDTO.getNumber());
                ps.setTimestamp(6, timestamp);
                ps.setString(7, userInfoDTO.getDescription());
                ps.setString(8, userInfoDTO.getPayload());

                return ps.execute();
            }
        });
    }
}
