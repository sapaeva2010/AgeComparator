public class Main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;
        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст


        if (vasyaAge >= 0 && vasyaAge <= 120 && katyaAge >= 0 && katyaAge <= 120 && mishaAge >= 0 && mishaAge <= 120) {
            if (katyaAge <= mishaAge && vasyaAge <= mishaAge && katyaAge <= vasyaAge) {
                min = katyaAge;
                middle = vasyaAge;
                max = mishaAge;

            } else if (katyaAge <= mishaAge && vasyaAge <= mishaAge && katyaAge >= vasyaAge) {
                min = vasyaAge;
                middle = katyaAge;
                max = mishaAge;

            } else if (katyaAge >= mishaAge && vasyaAge <= mishaAge && katyaAge >= vasyaAge) {
                min = vasyaAge;
                middle = mishaAge;
                max = katyaAge;

            } else if (katyaAge >= mishaAge && vasyaAge >= mishaAge && katyaAge >= vasyaAge) {
                min = mishaAge;
                middle = vasyaAge;
                max = katyaAge;

            } else if (katyaAge <= mishaAge && vasyaAge >= mishaAge && katyaAge <= vasyaAge) {
                min = katyaAge;
                middle = mishaAge;
                max = vasyaAge;

            } else if (katyaAge >= mishaAge && vasyaAge >= mishaAge && katyaAge <= vasyaAge) {
                min = mishaAge;
                middle = katyaAge;
                max = vasyaAge;
            }
            System.out.println("Minimal age:" + min);
            System.out.println("Middle age:" + middle);
            System.out.println("Maximal age:" + max);
        }
    }
}