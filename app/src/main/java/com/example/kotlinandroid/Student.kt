package com.example.kotlinandroid

data class Student(
    val name: String?,
    val score: Int
)

fun getGrade(score: Int): String = when {
    score >= 80 -> "A"
    score >= 70 -> "B"
    score >= 60 -> "C"
    else -> "D"
}

fun getStatus(score: Int): String =
    if (score >= 60) "Lulus" else "Tidak Lulus"

fun formatStudent(student: Student): String {
    val displayName = student.name ?: "Guest"

    return "$displayName | Nilai: ${student.score} | " +
            "Grade: ${getGrade(student.score)} | " +
            "Status: ${getStatus(student.score)}"
}

fun formatStudents(students: List<Student>): String {
    return students.joinToString(separator = "\n") {
        formatStudent(it)
    }
}