package com.bjsxt.designpattern.chainofresp;

/**
 * 具体处理者1
 */
public class Director extends Leader{
    public Director(String name) {
        super(name);
    }

    @Override
    public void hanlerRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= 3) {
            System.out.println("员工: " + request.getEmpName() + "请假：" + request.getLeaveDays()+"请假原因: " + request.getReason());
            System.out.println("主任：" + this.name + "审批通过");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.hanlerRequest(request);
            }
        }
    }
}
