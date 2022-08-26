public class Main {

    public static void main (String[] args) {
        Post post = new Post();
        post.name = "Дарья";
        post.patronymic = "Александровна";
        post.surname = "Ембахтова";
        post.passport = "00 00 № 900900";
        post.phone = "8(900)05-55-55";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 18;
        post.birthday.month = 11;
        post.birthday.year = 1993;
    }
}
