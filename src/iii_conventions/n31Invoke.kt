package iii_conventions

import util.TODO


class Invokable(var invocation : Int = 0){
    operator fun invoke(): Invokable {
        invocation++
        return this
    }

    fun getNumberOfInvocations() = invocation
}

fun todoTask31(): Nothing = TODO(
    """
        Task 31.
        Change the class 'Invokable' to count the number of invocations:
        for 'invokable()()()()' it should be 4.
    """,
    references = { invokable: Invokable -> })

fun task31(invokable: Invokable): Int {
//    todoTask31()
    return invokable()()()().getNumberOfInvocations()
}