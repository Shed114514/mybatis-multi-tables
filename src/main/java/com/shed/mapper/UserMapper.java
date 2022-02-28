package com.shed.mapper;

import com.shed.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUsersAndRoles();
}
