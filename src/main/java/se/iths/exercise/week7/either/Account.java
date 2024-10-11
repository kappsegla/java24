package se.iths.exercise.week7.either;

// a user can have zero or more accounts
public record Account(int id, User user) {
}
