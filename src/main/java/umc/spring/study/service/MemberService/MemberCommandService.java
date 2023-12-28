package umc.spring.study.service.MemberService;

import umc.spring.study.domain.Member;
import umc.spring.study.web.dto.MemberRequestDTO;

public interface MemberCommandService {
    public Member joinMember(MemberRequestDTO.JoinDto request);
}
