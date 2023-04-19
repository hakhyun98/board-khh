package idusw.springboot.board3b.service;

import idusw.springboot.board3b.domain.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Override
    public int create(Member m) {
        return 0;
    }

    @Override
    public Member read(Member m) {
        return null;
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
}
