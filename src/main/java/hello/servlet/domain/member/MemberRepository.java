package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    // static으로 생성했기 때문에 MemberRepository가 아무리 new로 많이 생성되어도 store와 sequence는 딱 하나만 생성되서 사용된다.
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository(); // 싱글톤으로 만들어준다.
    public static MemberRepository getInstance() {
        return instance;
    }
    private MemberRepository() { // 싱글톤을 사용할 때는 private으로 생성자를 만들어줘야 아무대서나 객체를 생성하지 못한다.
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
