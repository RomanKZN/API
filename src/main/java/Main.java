public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        Post.birthday = new FormDate();

        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = 8_900_000_000l;
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1990;

    }
}
