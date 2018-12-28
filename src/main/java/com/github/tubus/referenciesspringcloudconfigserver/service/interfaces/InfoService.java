package com.github.tubus.referenciesspringcloudconfigserver.service.interfaces;

import com.github.tubus.referenciesspringcloudconfigserver.dto.InfoResponse;
import com.github.tubus.referenciesspringcloudconfigserver.dto.info.UserInfoDTO;
import java.util.List;

/**
 * @author mujum
 *
 * Сервис выдачи информации о приложении
 */
public interface InfoService {

    /**
     * Получение общей информации о приложении
     *
     * @return InfoResponse - сводная информация о компоненте
     */
    InfoResponse getInfo();

    /**
     * Создание польователя
     *
     * @param userInfoDTO - инофрмация о пользователе
     * @throws Exception - ошибка, возникшая при создании пользователя
     */
    void createUserInfo(UserInfoDTO userInfoDTO) throws Exception;

    /**
     * Получение списка пользователей
     *
     * @return - List<UserInfoDTO> список пользователей
     */
    List<UserInfoDTO> getAllUsersInfo();
}
