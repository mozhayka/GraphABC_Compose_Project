package Time

class Timer
{
    companion object
    {
        var delay : Long = 0
            private set

        fun Wait(time : Long)
        {
            delay += time
        }
    }
}