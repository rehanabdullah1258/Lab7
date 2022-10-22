public class Ex3_NumericQuestion extends Questions{
    private double answer;
    public void setAnswer(double correctResponse)
    {
        answer=correctResponse;
    }
    public boolean checkAnswer(String Response)
    {
        super.check_answer(Response);
        double responseDouble=Double.parseDouble(Response);
            return  Math.abs(responseDouble-answer)<=0.01;
    }

}
