public class Point2DConstructor{

        private float x;
        private float y;

        public Point2DConstructor(float x, float  y)
        {
           this.x=x;
           this.y=y;
        }
        
        public Point2DConstructor()
        {
            this(0,0);
        }   

        public float getX()
        {
            return this.x;
        }
        public float getY()
        {
            return this.y;
        }
    
        public boolean isEixoX()
        {
            return (this.y==0);
        }
    
        public boolean isEixoY()
        {
            return (this.x==0);
        }
    
        public boolean isEixos()
        {
            return (!(isEixoX())&&!(isEixoY()));
        }
    
        public final void setPoint2D(float x1, float y1)
        {
            this.x=x1;
            this.y=y1;
        }
    
        public int quadrant()
        {
            if((x>0)&&(y>0))
            {
                return 1;
            }
            else if((x<0)&&(y>0))
            {
                return 2;
            }
            else if((x<0)&&(y<0))
            {
                return 3;
            }
            else if((x>0)&&(y<0))
            {
                return 4;
            }
    
            return 0;
        }
    
        public double distance(Point2DConstructor outroPonto)
        {
            double distanceTwoPoints;
            distanceTwoPoints=(this.x-outroPonto.x)*(this.x-outroPonto.x)+(this.y-outroPonto.y)*(this.y-outroPonto.y);
            return Math.sqrt(distanceTwoPoints);
        }
  
}