package hello.hellospring.repository;

import hello.hellospring.vo.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<String, Member> store = new HashMap<>();
    private static long sequence = 0L;


    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> fingAll() {
        return null;
    }
}
