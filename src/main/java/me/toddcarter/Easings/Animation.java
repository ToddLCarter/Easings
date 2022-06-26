package me.toddcarter.Easings;

public class Animation {

   private double duration;
   private long startTime = System.currentTimeMillis();
   private Easing ease;
   private AnimationType type;

   public Animation(Easing ease, float duration) {
      this(ease, duration, AnimationType.ONCE);
   }

    public Animation(Easing ease, float duration, AnimationType type) {
        this.ease = ease;
        this.duration = duration;
        this.type = type;
    }

    public double getProgress() {
        double time = (System.currentTimeMillis() - this.startTime);

        switch (this.type) {
            case ONCE:
                return Math.min(time / this.duration, 1.0D);
            case REVERSED:
                return  Math.max(1.0D - time / this.duration, 0D);
            case LOOP:
                if(time > this.duration) this.startTime = System.currentTimeMillis();
        }

        return time / this.duration;
    }

   public double value() {
      return this.ease.apply(this.getProgress());
   }


}
