package recursion_Hanoi_Tower;

public class HanoiTowers {
    private Pillar[] pillars = new Pillar[3];
    private int count = 0;

    public HanoiTowers() {
        pillars[0] = new Pillar(5);
        pillars[1] = new Pillar(0);
        pillars[2] = new Pillar(0);
    }

    public void solve() {
        solve(pillars[0], pillars[2], pillars[1], pillars[0].size());
    }

    private void solve(Pillar src, Pillar dest, Pillar intermediate, int num) {
        if(num == 1) {
            dest.put(src.take()); // stop condition
        }
        else {
            solve(src, intermediate, dest, num - 1);
            dest.put(src.take()); // take 1
            solve(intermediate, dest, src, num - 1);
        }
        ++count;
        System.out.println(count);
        for(Pillar p : pillars) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        new HanoiTowers().solve();
    }

}

