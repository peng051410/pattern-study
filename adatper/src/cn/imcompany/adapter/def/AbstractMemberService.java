package cn.imcompany.adapter.def;

/**
 * Created by tomyli on 2018/6/22.
 * Github: https://github.com/peng051410
 */
public abstract class AbstractMemberService implements IMemberService {

    public abstract void saveMember();

    public abstract void getMember();

    @Override
    public boolean isGirl() {
        return true;
    }

    @Override
    public boolean isBoy() {
        return false;
    }

    @Override
    public boolean isVip() {
        return false;
    }

}
