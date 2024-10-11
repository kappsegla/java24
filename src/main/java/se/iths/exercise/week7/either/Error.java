package se.iths.exercise.week7.either;

public interface Error {
    record UserNotFound() implements Error {}
    record AccountNotFound() implements Error {}
}
