//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//
////import datastucture.Edge;
//
//
//public static void kruskal(Graph g) {
//        //    每个顶点加编号
//        int[] parent = new int[g.MAX_VERTEX ];
//        for (int i = 0; i < g.MAX_VERTEX; i++) {
//            parent[i] = i;
//        }
////        找到n-1条边，既满足条件
//        while (result.size() < (g.MAX_VERTEX-1) ) {
//            // 取最小边
//            double min = MOUSTMAX;
//            int jtemp=0;
//            int i = 0;
//            
//            for(int k=0;k<g.MAX_VERTEX;k++){
//                for (int j = 0; j < g.MAX_VERTEX; j++) {
////                    System.out.println("-------------"+k+"--"+j + "parent[" + k + "]--"+parent[k]+"parent[" + j+"]" +parent[j] + "--"+g.L1_Matrix[k][j] + "min" + min);
//                    if ((parent[k] != parent[j] ) && g.L1_Matrix[k][j] < min) {
//                        min = g.L1_Matrix[k][j];
//                        jtemp = j;
//                        i=k;
//                    }
//                }
//            }
//            int jj = parent[i];
//            int kk = parent[jtemp];
//            proc.add("------选中结点 "+i+" 与结点 "+jtemp + " ，路径长度：" + g.L1_Matrix[i][jtemp]);
//            //判断该边的两个端点是否在同一个子树中：
//            //   不在：将该边加入结果集
//            //     在：继续循环
//            if (kk != jj) {
//                int tempi = parent[i];
//                //将新找到的边的顶点与以前的顶点标志值设为一样，注意要把以前的顶点相连的顶点都要同步改变值
//                for(int j = 0; j<parent.length;j++){
//                    if(parent[j] == tempi )
//                        parent[j] = parent[jtemp];
//                }
//                //取出已经加入的边
//                boolean temp = true;
//                for(Vertex[] v:result){
//                    if(v[0] == g.vertexList[i] && v[1] ==g.vertexList[jtemp]){
//                        temp = false;
//                    }
//                    if(v[1] == g.vertexList[i] && v[0] ==g.vertexList[jtemp]){
//                        temp = false;
//                    }
//                }
//                if(temp){
//                    result.add(new Vertex[] { g.vertexList[i],g.vertexList[jtemp] } );
//                }
//                //将已找到的边，权值设为最大
//                g.L1_Matrix[i][jtemp] = MOUSTMAX;
//                
//            }
//            
//        }
//    }
//}
//
///**
// * 求最小树的Kruskal算法 算法思想：克鲁斯卡尔算法从另一个途径求网中的最小生成树。假设联通网N=(V,{E})，则令
// * 最小生成树的厨师状态为只有n个顶点而无边的非连通图T=(V,{})，途中每个顶点自称一个连通分量。
// * 在E中选择代价最小的边，若该边衣服的顶点落在T中不同的连通分量上，则将此边加入到T中，否则舍去此边
// * 而选择下一条最小的边。以此类推，直至T中所有的顶点都在同一连通分量上为止。
// * 
// * @param V
// *            图中的节点集合
// * @param E
// *            图中边的集合
// */
//@SuppressWarnings({ "rawtypes", "unchecked" })
//public static void KRUSKAL(int[] V, Edge[] E) {
//	Arrays.sort(E);// 将边按照权重w升序排序
//	ArrayList<HashSet> sets = new ArrayList<HashSet>();
//	for (int i = 0; i < V.length; i++) {
//		HashSet set = new HashSet();
//		set.add(V[i]);
//		sets.add(set);
//	}
//
//	System.out.println("++++++++++++++++++++++size=" + sets.size());
//	for (int i = 0; i < E.length; i++) {
//		int start = E[i].i, end = E[i].j;
//		int counti = -1, countj = -2;
//		for (int j = 0; j < sets.size(); j++) {
//			HashSet set = sets.get(j);
//			if (set.contains(start)) {
//				counti = j;
//			}
//
//			if (set.contains(end)) {
//				countj = j;
//			}
//		}
//		if (counti < 0 || countj < 0)
//			System.err.println("没有在子树中找到节点，错误");
//
//		if (counti != countj) {
//			System.out.println("输出start=" + start + "||end=" + end + "||w="
//					+ E[i].w);
//			HashSet setj = sets.get(countj);
//			sets.remove(countj);
//			HashSet seti = sets.get(counti);
//			sets.remove(counti);
//			seti.addAll(setj);
//			sets.add(seti);
//		} else {
//			System.out.println("他们在一棵子树中，不能输出start=" + start + "||end="
//					+ end + "||w=" + E[i].w);
//
//		}
//	}
//}
//}
