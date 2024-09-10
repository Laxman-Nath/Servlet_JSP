package com.service;

import com.models.Admin;

public interface AdminService {
 void addAdmin(Admin a);
 Admin getAdmin(String name,String password);
 boolean verify(String name,String password);
}
