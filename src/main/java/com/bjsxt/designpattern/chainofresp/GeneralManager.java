package com.bjsxt.designpattern.chainofresp;

/**
 * 具体处理者3
 */
public class GeneralManager extends Leader{
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void hanlerRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("员工: " + request.getEmpName() + "请假：" + request.getLeaveDays()+"请假原因: " + request.getReason());
            System.out.println("总经理：" + this.name + "审批通过");
        } else {
            System.out.println("员工: " + request.getEmpName() + "请假：" + request.getLeaveDays()+"请假原因: " + request.getReason());
            System.out.println("看来这位员工是不想干了，竟然请假：" + request.getLeaveDays()+ "天");
        }
    }
}
