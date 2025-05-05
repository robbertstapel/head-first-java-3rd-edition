class Echo {
    int count = 0;
    void hello() {
        System.out.println("helloooo... ");
    }
}

// The while loop runs 4 times, 0, 1, 2 and 3 before condition is broken (4 is not smaller than 4)
// In these 4 loops we have e1.count and e2.count
// both start at 0 and remain 0 for the first loop

// First loop:
// e1.count is incremented by 1

// Second loop:
// e1.count is again incremented by 1 (and becomes 2)
// -- and e2.count is incremented by 1 (becomes 1)

// Third loop:
// e1.count is incremented by 1 (and becomes 3)
// -- and e2.count is incremented by 1 (becomes 2)
// Now both if statements are true so 2 + 3 = 5 (e2.count + e1.count)

// Fourth loop: e1.count is incremented by 1 (and becomes 4)
// and e2.count is incremented by 2 (becomes 6)
// Still both if statements are true so 6 + 4 = 10 (e2.count + e1.count)

class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo(); // e2 = e1 = bonus

        int x = 0;
        while (x < 4) { // x starts as 0 so 4 iterations
            e1.hello();
            e1.count = e1.count + 1; // same e1.count ++
            if (x > 0) { // x starts as 0 so 1st iteration is false
                e2.count = e2.count + 1; // 0 + 1 = 1
            }
            if (x > 1) { // x starts as 0 so 2nd iteration is false
                e2.count = e2.count + e1.count; // 2 + 3 = 5 and 6 + 4 = 10
            }
            x = x + 1;
        }
        System.out.println(e2.count);

    }
}