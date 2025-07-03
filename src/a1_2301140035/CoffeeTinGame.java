package a1_2301140035;
import java.util.Arrays;
import java.util.Random;
/**
 * @overview A program that performs the coffee tin game on a
 *    tin of beans and display result on the standard output.
 *
 */
public class CoffeeTinGame {
    /** constant value for the green bean*/
    private static final char GREEN = 'G';
    /** constant value for the blue bean*/
    private static final char BLUE = 'B';
    /** constant for removed beans */
    private static final char REMOVED = '-';
    /** the null character*/
    private static final char NULL = '\u0000';
     // Create BeansBag
     private static final char[] BeansBag;

    // Khởi tạo BeansBag (câu a)
    static {
        BeansBag = new char[30]; // Mảng có 30 phần tử
        int numB = 10;  // 1/3 số lượng là B
        int numG = 10;  // 1/3 số lượng là G
        int numEmpty = 10;  // 1/3 số lượng là '-'

        // Adding B into Array
        for (int i = 0; i < numB; i++) {
            BeansBag[i] = BLUE;
        }

        // Adding G into Array
        for (int i = numB; i < numB + numG; i++) {
            BeansBag[i] = GREEN;
        }

        // Thêm '-' vào mảng
        for (int i = numB + numG; i < 30; i++) {
            BeansBag[i] = REMOVED;
        }
    }

    //d random number
    public static int randInt(int n){
        Random rand = new Random();
        return rand.nextInt(n);
    }
    /**
     * the main procedure
     * @effects
     *    initialise a coffee tin
     *    {@link TextIO#putf(String, Object...)}: print the tin content
     *    {@link @tinGame(char[])}: perform the coffee tin game on tin
     *    {@link TextIO#putf(String, Object...)}: print the tin content again
     *    if last bean is correct
     *      {@link TextIO#putf(String, Object...)}: print its colour
     *    else
     *      {@link TextIO#putf(String, Object...)}: print an error message
     */

    public static void main(String[] args) {
        // initialise some beans
        char[][] tins = {
                {BLUE, BLUE, BLUE, GREEN, GREEN},
                {BLUE, BLUE, BLUE, GREEN, GREEN, GREEN},
                {GREEN},
                {BLUE},
                {BLUE, GREEN}
        };

        for (int i = 0; i < tins.length; i++) {
            char[] tin = tins[i];

            // expected last bean
            // p0 = green parity /\
            // (p0=1 -> last=GREEN) /\ (p0=0 -> last=BLUE)
            // count number of greens
            int greens = 0;
            for (char bean : tin) {
                if (bean == GREEN)
                    greens++;
            }
            // expected last bean
            final char last = (greens % 2 == 1) ? GREEN : BLUE;

            // print the content of tin before the game
            System.out.printf("%nTIN (%d Gs): %s %n", greens, Arrays.toString(tin));

            // perform the game
            // get actual last bean
            char lastBean = tinGame(tin);
            // lastBean = last \/ lastBean != last

            // print the content of tin and last bean
            System.out.printf("tin after: %s %n", Arrays.toString(tin));

            // check if last bean as expected and print
            if (lastBean == last) {
                System.out.printf("last bean: %c%n", lastBean);
            } else {
                System.out.printf("Oops, wrong last bean: %c (expected: %c)%n", lastBean, last);
            }
        }
    }

    /**
     * Performs the coffee tin game to determine the colour of the last bean
     *
     * @requires tin is not null /\ tin.length > 0
     * @modifies tin
     * @effects <pre>
     *   take out two beans from tin
     *   if same colour
     *     throw both away, put one blue bean back
     *   else
     *     put green bean back
     *   let p0 = initial number of green beans
     *   if p0 = 1
     *     result = `G'
     *   else
     *     result = `B'
     *   </pre>
     */
    public static char tinGame(char[] tin) {
        while (hasAtLeastTwoBeans(tin)) {
            char beanOne = takeOne(tin); // Lấy hạt đầu tiên
            char beanTwo = takeOne(tin); // Lấy hạt thứ hai

            updateTin(tin, beanOne, beanTwo); // Gọi updateTin để xử lý
        }
        return anyBean(tin);
    }

    /**
     * @effects
     *  if tin has at least two beans
     *    return true
     *  else
     *    return false
     */
    private static boolean hasAtLeastTwoBeans(char[] tin) {
        int count = 0;
        for (char bean : tin) {
            if (bean != REMOVED) {
                count++;
            }

            if (count >= 2) // enough beans
                return true;
        }

        // not enough beans
        return false;
    }

    /**
     * @requires tin has at least 2 beans left
     * @modifies tin
     * @effects
     *  remove any two beans from tin and return them
     */
    private static char[] takeTwo(char[] tin) {
        char first = takeOne(tin);
        char second = takeOne(tin);

        return new char[]{first, second};
    }

    /**
     * @requires tin has at least one bean
     * @modifies tin
     * @effects
     *   remove any bean from tin and return it
     */

    // e) configuring takeOne

    public static char takeOne(char[] tin) {
        if (tin == null || tin.length == 0) {
            return NULL;
        }

        int index;
        do {
            index = randInt(tin.length); // choose some random place
        } while (tin[index] == REMOVED); // Nếu vị trí đã bị xóa thì thử lại

        char bean = tin[index]; // Lấy hạt đậu tại vị trí index
        tin[index] = REMOVED; // Đánh dấu hạt này là đã lấy
        return bean;
    }
    // F taking random bean from Beansbag B or G
    public static char getBean(char[] beansBag, char beanType) {
        if (beansBag == null || beansBag.length == 0) {
            return NULL;
        }

        int index;
        do {
            index = randInt(beansBag.length); // Chọn vị trí ngẫu nhiên
        } while (beansBag[index] != beanType && beansBag[index] != REMOVED);

        if (beansBag[index] == beanType) {
            char pickedBean = beansBag[index];
            beansBag[index] = REMOVED; // Đánh dấu hạt này là đã lấy
            return pickedBean;
        }

        return NULL; // Không tìm thấy hạt phù hợp
    }
    public static void updateTin(char[] tin, char beanOne, char beanTwo) {
        if (beanOne == beanTwo) {
            // Cả hai hạt cùng màu → bỏ đi, thêm một hạt 'B' từ BeansBag
            char newBean = getBean(BeansBag, BLUE); // Lấy hạt B từ BeansBag
            if (newBean == NULL) {
                newBean = BLUE; // Nếu không còn B trong BeansBag, thêm B mặc định
            }
            putIn(tin, newBean);
        } else {
            // Hai hạt khác màu → bỏ B, thêm lại G vào tin
            putIn(tin, GREEN);
        }
    }


    /**
     * @requires tin has vacant positions for new beans
     * @modifies tin
     * @effects
     *   place bean into any vacant position in tin
     */
    private static void putIn(char[] tin, char bean) {
        for (int i = 0; i < tin.length; i++) {
            if (tin[i] == REMOVED) { // vacant position
                tin[i] = bean;
                break;
            }
        }
    }

    /**
     * @effects
     *  if there are beans in tin
     *    return any such bean
     *  else
     *    return '\u0000' (null character)
     */
    private static char anyBean(char[] tin) {
        for (char bean : tin) {
            if (bean != REMOVED) {
                return bean;
            }
        }

        // no beans left
        return NULL;
    }

}

