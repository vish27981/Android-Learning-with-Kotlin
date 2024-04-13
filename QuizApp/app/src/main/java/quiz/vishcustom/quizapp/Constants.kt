package quiz.vishcustom.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answer"


    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Iraq","India",
            "South Africa", "Iran",
            2
        )
        questionList.add(que1)

        val que2 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Austria","Denmark",
            "Argentina", "Iran",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Australia","Egypt",
            "China", "Ethopia",
            1
        )
        questionList.add(que3)


        val que4 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "New ZeaLand","Brazil",
            "Belgium", "Iraq",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Dominica","Greece",
            "South Korea", "Fiji",
            4
        )
        questionList.add(que5)

        val que6 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Sudan","Brazil",
            "Barcelona", "France",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Jordan","UAE",
            "Denmark", "Japan",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Ireland","Kuwait",
            "Oslo", "Hungary",
            2
        )
        questionList.add(que8)

        val que9 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany","Norway",
            "North Korea", "Green Land",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New ZeaLand","India",
            "South Africa", "Iran",
            1
        )
        questionList.add(que10)
        return questionList
    }

}