public class Point2DConstructor{

        private int x;
        private int y;

        public Point2DConstructor()
        {
            this.x=0;
            this.y=0;
        }   

        public Point2DConstructor(int x, int y)
        {
            this.x=x;
            this.y=y;
        }
    
        public int getX()
        {
            return this.x;
        }
        public int getY()
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
    
        public final void setPoint2D(int x1, int y1)
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