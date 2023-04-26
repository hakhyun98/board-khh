package idusw.springboot.boardKhh.repository;

import idusw.springboot.boardKhh.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

}
