package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 *
 */
public class Account extends BankAccount {

    private Long id;

    public Account() {
        id = 0L;
    }

    public Account(Long id) {
        this.id=id;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {

        this.id =id;
    }


}
