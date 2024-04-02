package RandomStringUtils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author alvaro
 */
public class Ejemp {

    public static void main(String[] args) {

        String cuenta = RandomStringUtils.randomNumeric(20);
        String miau = RandomStringUtils.randomAlphabetic(20);
        String miauu = RandomStringUtils.randomAlphanumeric(20);
        
        System.out.println(cuenta);
        System.out.println(miau);
        System.out.println(miauu);
    }
}
