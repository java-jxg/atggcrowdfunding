package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.po.MemberPO;

public interface MemberService {

    MemberPO getMemberPOByLoginAcct(String loginacction);

    void saveMember(MemberPO memberPO);

}
