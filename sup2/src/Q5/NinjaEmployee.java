package Q5;

/**
 * Created by Anchor on 2016/11/24.
 */
public class NinjaEmployee extends Employee implements NinjaInt {
    private Ninja ninjaSoul = new Ninja();

    @Override
    public void ninjaBehaviour() {
        ninjaSoul.ninjaBehaviour();
    }
}
