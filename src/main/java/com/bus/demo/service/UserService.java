package com.bus.demo.service;

import java.util.UUID;

public interface UserService {
    boolean isAdmin(UUID role);
}
