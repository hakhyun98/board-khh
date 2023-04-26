package idusw.springboot.boardKhh;

import idusw.springboot.boardKhh.controller.MemberController;
import idusw.springboot.boardKhh.domain.Member;
import idusw.springboot.boardKhh.domain.Memo;
import idusw.springboot.boardKhh.service.MemberService;
import idusw.springboot.boardKhh.service.MemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoradkhhApplicationTests {
    @Autowired
    MemberService memberService;
    @Autowired
    MemoService memoService;

    @Test
    void contextLoads() {
        Member member = Member.builder()
                .email("khh1@induk.ac.kr")
                .name("khh1")
                .pw("1234")
                .build();
        if(memberService.create(member) > 0) { // 정상적으로 레코드의 변화가 발생하는 경우 영향받는 레코드 수를 반환
            System.out.println("등록 성공");
        }
        else {
            System.out.println("등록 실패");
        }
    }

        @Test
        void readMember() { // seq를 사용해야 함
            Member member = Member.builder()
                    .seq(52L)
                    .build();
            Member result = null;
            if((result=memberService.read(member)) != null) { // 정상적으로 레코드의 변화가 발생하는 경우 영향받는 레코드 수를 반환
                System.out.println("조회 성공!" + result.getEmail() + ":" + result.getName());
            }
            else {
                System.out.println("조회 실패!");
            }
        }

//        @Test
//        public void readMemo(){
//            Memo m = new Memo();
//            m.setMno(1L);
//            Memo result;
//            if((result = memoService.read(m)) != null){
//                System.out.println(result.getMemoText());
//            }
//        }
    }

