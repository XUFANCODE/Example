//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//
////import datastucture.Edge;
//
//
//public static void kruskal(Graph g) {
//        //    ÿ������ӱ��
//        int[] parent = new int[g.MAX_VERTEX ];
//        for (int i = 0; i < g.MAX_VERTEX; i++) {
//            parent[i] = i;
//        }
////        �ҵ�n-1���ߣ�����������
//        while (result.size() < (g.MAX_VERTEX-1) ) {
//            // ȡ��С��
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
//            proc.add("------ѡ�н�� "+i+" ���� "+jtemp + " ��·�����ȣ�" + g.L1_Matrix[i][jtemp]);
//            //�жϸñߵ������˵��Ƿ���ͬһ�������У�
//            //   ���ڣ����ñ߼�������
//            //     �ڣ�����ѭ��
//            if (kk != jj) {
//                int tempi = parent[i];
//                //�����ҵ��ıߵĶ�������ǰ�Ķ����־ֵ��Ϊһ����ע��Ҫ����ǰ�Ķ��������Ķ��㶼Ҫͬ���ı�ֵ
//                for(int j = 0; j<parent.length;j++){
//                    if(parent[j] == tempi )
//                        parent[j] = parent[jtemp];
//                }
//                //ȡ���Ѿ�����ı�
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
//                //�����ҵ��ıߣ�Ȩֵ��Ϊ���
//                g.L1_Matrix[i][jtemp] = MOUSTMAX;
//                
//            }
//            
//        }
//    }
//}
//
///**
// * ����С����Kruskal�㷨 �㷨˼�룺��³˹�����㷨����һ��;�������е���С��������������ͨ��N=(V,{E})������
// * ��С�������ĳ�ʦ״̬Ϊֻ��n��������ޱߵķ���ͨͼT=(V,{})��;��ÿ�������Գ�һ����ͨ������
// * ��E��ѡ�������С�ıߣ����ñ��·��Ķ�������T�в�ͬ����ͨ�����ϣ��򽫴˱߼��뵽T�У�������ȥ�˱�
// * ��ѡ����һ����С�ıߡ��Դ����ƣ�ֱ��T�����еĶ��㶼��ͬһ��ͨ������Ϊֹ��
// * 
// * @param V
// *            ͼ�еĽڵ㼯��
// * @param E
// *            ͼ�бߵļ���
// */
//@SuppressWarnings({ "rawtypes", "unchecked" })
//public static void KRUSKAL(int[] V, Edge[] E) {
//	Arrays.sort(E);// ���߰���Ȩ��w��������
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
//			System.err.println("û�����������ҵ��ڵ㣬����");
//
//		if (counti != countj) {
//			System.out.println("���start=" + start + "||end=" + end + "||w="
//					+ E[i].w);
//			HashSet setj = sets.get(countj);
//			sets.remove(countj);
//			HashSet seti = sets.get(counti);
//			sets.remove(counti);
//			seti.addAll(setj);
//			sets.add(seti);
//		} else {
//			System.out.println("������һ�������У��������start=" + start + "||end="
//					+ end + "||w=" + E[i].w);
//
//		}
//	}
//}
//}
