package Modelo;

public class Laberinto
{
    private final byte maze[][];
    private final int xInicio, yInicio;
    private final int m, n;
    private char salida[][];
    private long nPasos;
    private String recorrido;
    
    public Laberinto(byte[][] maze, int xInicio, int yInicio, int m, int n)
    {
        this.maze = maze;
        this.xInicio = xInicio;
        this.yInicio = yInicio;
        this.m = m;
        this.n = n;
        nPasos = 0;
        recorrido = "";
        
        salida = new char[m][n];
        
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                salida[i][j] = '0';
    }
    
    public boolean buscaSalida(int x, int y)
    {
        // Si estamos dentro de los limites del laberinto
        if(x >= 0 && y >= 0 && x < m && y < n)
        {
            // Si hay un camino libre
            // Y
            // Si estamos al borde derecho
            // O bien al borde inferior del laberinto
            // Encontramos una salida al laberinto
            if((maze[x][y] == 1) && (y == n-1 || x == m-1 || y == 0 || x == 0) && ( x != xInicio && y != yInicio))
            {
                salida[x][y] = 'S';
                return true;
            }
            
            // Si la posicion esta dentro de los bordes del laberinto
            // Si hay camino libre en el laberinto
            // Si no hemos visitado aun el camino
            if(maze[x][y] == 1 && salida[x][y] != '1')
            {
                salida[x][y] = '1';
                guardaRecorrido();
                
                // Buscamos abajo
                if(buscaSalida(x+1, y))
                    return true;

                // Buscamos a la derecha
                if(buscaSalida(x, y+1))
                    return true;

                // Buscamos arriba
                if(buscaSalida(x-1, y))
                    return true;

                // Buscamos a la izquierda
                if(buscaSalida(x, y-1))
                    return true;

                // No encontramos ruta por lo que
                // aplicando backtraking, marcamos la
                // ruta como falsa (no lleva a la salida)
                salida[x][y] = 'X';
                guardaRecorrido();
            }
        }
        
        return false;
    }
    
    private void guardaRecorrido()
    {
        int i, j;
        recorrido += '\n';
        nPasos++;
        
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                recorrido += salida[i][j]+" ";
            
            recorrido += '\n';
        }
    }
    
    public String printSalida()
    {
        int i, j;
        String ruta = "";
        salida[xInicio][yInicio] = 'P';
        nPasos++;
        
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                ruta += salida[i][j]+" ";
            
            ruta += '\n';
        }
        
        return ruta;
    }
    
    public String getRecorrido() { return recorrido; }
    public void resetRecorrido() { recorrido = ""; }
    
    public long getnPasos() { return nPasos; }
    public void resetNPasos() { nPasos = 0; }
}