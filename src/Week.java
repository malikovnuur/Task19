public enum Week {
    ДҮЙШӨМБҮ("study Java "),
    ШЕЙШЕМБИ("Practise"),
    ШАРШЕМБИ("English lesson"),
    БЕЙШЕМБИ("Softskill lesson"),
    ЖУМА("study Java "),
    ИШЕМБИ("Weekends"),
    ЖЕКШЕМБИ("Weekends");

    private String plan;

    Week(String plan) {
        this.plan = plan;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Week{" +
                "plan='" + plan + '\'' +
                '}';
    }
}
