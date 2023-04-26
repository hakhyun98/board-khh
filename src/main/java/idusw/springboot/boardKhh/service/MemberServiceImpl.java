package idusw.springboot.boardKhh.service;

import idusw.springboot.boardKhh.domain.Member;
import idusw.springboot.boardKhh.domain.Memo;
import idusw.springboot.boardKhh.entity.MemberEntity;
import idusw.springboot.boardKhh.entity.MemoEntity;
import idusw.springboot.boardKhh.repository.MemberRepository;
import idusw.springboot.boardKhh.repository.MemoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    // DI - IoC (Inversion of Controller) : 제어의 역전) 방법 중 하나 , DI, DL ...
    MemberRepository memberRepository;
    public MemberServiceImpl(MemberRepository memberRepository) { // spring Framework이 주입(하도록 요청함)
        this.memberRepository = memberRepository;
    }
    @Override
    public int create(Member m) {
        MemberEntity entity = MemberEntity.builder()
                .seq(m.getSeq())
                .email(m.getEmail())
                .name(m.getName())
                .pw(m.getPw())
                .build();
        if(memberRepository.save(entity) != null) { // 저장 성공
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public Member read(Member m) {
        MemberEntity e = memberRepository.getById(m.getSeq()); // JpaRepository 구현체의 메소드
        Member result = new Member(); // DTO (Data Transfer Object) : Controller - Service or Controller - View
        System.out.println(e);
        result.setSeq(e.getSeq());
        result.setEmail(e.getEmail());
        result.setName(e.getName());
        return result;
    }

    @Override
    public List<Member> readList() {
        return null;
    }

    @Override
    public int update(Member m) {
        return 0;
    }

    @Override
    public int delete(Member m) {
        return 0;
    }

    @Override
    public Member login(Member m) {
        MemberEntity e = memberRepository.getByEmailPw(m.getEmail(), m.getPw()); // JpaRepository 구현체의 메소드
        Member result = null; // DTO (Data Transfer Object) : Controller - Service or Controller - View
        if(e != null) {
            result = new Member();
            result.setSeq(e.getSeq());
            result.setEmail(e.getEmail());
            result.setName(e.getName());
        }
        return result;
    }
}
