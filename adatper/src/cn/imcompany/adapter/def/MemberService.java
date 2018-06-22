package cn.imcompany.adapter.def;

/**
 * Created by tomyli on 2018/6/22.
 * Github: https://github.com/peng051410
 */
public class MemberService extends AbstractMemberService {

    @Override
    public void saveMember() {
        System.out.println("saveMember");
    }

    @Override
    public void getMember() {
        System.out.println("getMember");
    }
}
