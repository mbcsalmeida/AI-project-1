public class Memory {
	/**
	 * Guarda o conjunto de pontos gerados, não sendo nunca alterado,
	 * e o número de pontos
	 */
	int memSize, nPoints;
	Point[] points;
	
	Memory(int m){
		memSize = m;
		nPoints = 0;
		points = new Point[memSize] ;
	}
	
	public void add(int x, int y, int index) {
		points[nPoints++] = new Point(x, y, index);
	}
	
	public boolean contains(int x, int y) {
		
		for(int i=0; i<nPoints; i++)
			if(points[i].equals(x,y)) return true;
		
		return false;
	}
}
