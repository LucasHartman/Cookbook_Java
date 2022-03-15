class Tree {}

public class Exercise41 extends Tree {
    public static void main(String[] args) {
        Exercise41().go();
    }

    void go() {
        go2(new Tree(), Exercise41());
        go2((Exercise41) new Tree(), new Exercise41());
    }

    void go2(Tree t1, Exercise41 r1) {
        Exercise41 r2 = (Exercise41)t1;
        Tree t2 = (Tree)r1;
    }
    
}

// ???????????????????????????????/
