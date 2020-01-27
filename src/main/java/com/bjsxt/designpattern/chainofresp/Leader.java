package com.bjsxt.designpattern.chainofresp;

/**
 * 抽象类处理者
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;    //责任链的后继对象

    public Leader(String name) {
        this.name = name;
    }

    //设置责任链的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    //处理请求的核心业务方法
    public abstract void hanlerRequest(LeaveRequest request);

}
