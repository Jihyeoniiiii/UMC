package umc.spring.study.service.ChallengeService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.spring.study.apiPayload.code.status.ErrorStatus;
import umc.spring.study.apiPayload.exception.handler.MemberHandler;
import umc.spring.study.apiPayload.exception.handler.MissionHandler;
import umc.spring.study.apiPayload.exception.handler.StoreHandler;
import umc.spring.study.converter.ChallengeConverter;
import umc.spring.study.converter.MissionConverter;
import umc.spring.study.domain.Member;
import umc.spring.study.domain.Mission;
import umc.spring.study.domain.Store;
import umc.spring.study.domain.mapping.MemberMission;
import umc.spring.study.repository.MemberMissionRepository;
import umc.spring.study.repository.MemberRepository;
import umc.spring.study.repository.MissionRepository;
import umc.spring.study.repository.StoreRepository;
import umc.spring.study.web.dto.ChallengeRequestDTO;
import umc.spring.study.web.dto.MissionRequestDTO;
@Service
@RequiredArgsConstructor
public class ChallengeServiceImpl {
    private final MemberMissionRepository memberMissionRepository;
    private final MemberRepository memberRepository;
    private final MissionRepository missionRepository;

    public MemberMission newMission(ChallengeRequestDTO.ChallengeDTO request){

        Long memberId = request.getMemberId();
        Long missionId = request.getMissionId();

        MemberMission newMission = ChallengeConverter.toMemberMission(request);

        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));
        newMission.setMemberId(member);

        Mission mission = missionRepository.findById(memberId)
                .orElseThrow(() -> new MissionHandler(ErrorStatus.MISSION_NOT_FOUND));
        newMission.setMissionId(mission);

        return memberMissionRepository.save(newMission);
    }
}
