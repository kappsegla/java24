package se.iths.oop;

public final class Safe {
    private final String secret;

    private Safe(String secret) {
        this.secret = secret;
    }

    public static Safe of(String secret) {
        return new Safe(secret);
    }

    public static Safe of(int secretValue){
        return new Safe(Integer.toString(secretValue));
    }

    public String getSecret() {
        return secret;
    }
}
