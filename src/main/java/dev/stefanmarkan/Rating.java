package dev.stefanmarkan;

public record Rating(String alias, String email, int score) {

    public Rating(String alias, String email, int score) {
        if (score > 10) {
            this.score = 10;
        } else if (score < 1) {
            this.score = 1;
        } else {
            this.score = score;
        }
        this.alias = alias;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("""
                        Alias: %s
                        E-Mail: %s
                        
                        Score: %d
                        """,
                alias(),
                email(),
                score());
    }
}
