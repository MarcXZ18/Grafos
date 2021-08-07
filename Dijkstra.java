
public class Dijkstra {
	public static void dijkstra(int[][] grafo, int vertR){
        int cantVertice = grafo.length;
        boolean[] visitaVertice = new boolean[cantVertice];
        int[] distancia = new int[cantVertice];
        for (int i = 0; i < cantVertice; i++){
            visitaVertice[i] = false;
            distancia[i] = Integer.MAX_VALUE;
        }
        distancia[vertR] = 0; 
        for (int i = 0; i < cantVertice; i++){         
            
            int u = buscarDistMinima(distancia, visitaVertice);           
            visitaVertice[u] = true;           
            for (int v =0 ; v < cantVertice; v++){            
                if(!visitaVertice[v] && grafo[u][v] != 0 && (distancia[u] + grafo[u][v] < distancia[v])){
                    distancia[v] = distancia[u] + grafo[u][v];
                }
            }
        }
        for (int i = 0; i < distancia.length; i++){
            System.out.println(String.format("Distancia del vértice origen al vértice fuente %s al vértice %s es %s", vertR, i, distancia[i]));
        }

    }

    private static int buscarDistMinima(int[] distancia, boolean[] visitaVertice) {
        int minDist = Integer.MAX_VALUE;
        int minDistVertice = -1;
        for (int i =0; i < distancia.length; i++){            
            if(!visitaVertice[i] && distancia[i] < minDist){
                minDist = distancia[i];
                minDistVertice = i;
            }
        }
        return minDistVertice;
    }

    public static void main(String[] args) {
        int grafo1[][] = new int[][] { 
        		{ 0, 4, 8, 0, 0 },
                { 4, 0, 2, 5, 0 },
                { 8, 2, 0, 5, 9},
                { 0, 5, 5, 0, 4 },
                { 0, 0, 9, 4, 0 } 
        };
        Dijkstra t = new Dijkstra();
        t.dijkstra(grafo1, 0);
    }
}
