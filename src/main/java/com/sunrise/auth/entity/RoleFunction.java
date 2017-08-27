package com.sunrise.auth.entity;

public class RoleFunction {
    private Long id;

    private Long roleId;

    private Long functionId;

    public RoleFunction(Long id, Long roleId, Long functionId) {
        this.id = id;
        this.roleId = roleId;
        this.functionId = functionId;
    }

    public RoleFunction() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }
}