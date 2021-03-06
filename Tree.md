<img src='https://user-images.githubusercontent.com/37543606/71775775-eb401980-2fc9-11ea-99ba-a54cd1067106.jpg'/>

이미지 출처 : https://adrianmejia.com/data-structures-for-beginners-trees-binary-search-tree-tutorial/



#### 트리 (Tree)

- Node와 Branch를 이용해서, 사이클을 이루지 않도록 구성한 데이터 구조
- 이진 트리 (Binary Tree) 형태의 구조로, 탐색(검색) 알고리즘 구현을 위해 많이 사용



#### 용어 정리

| 용어                          | 설명                                                         |
| ----------------------------- | ------------------------------------------------------------ |
| 노드 (Node)                   | 트리에서 데이터를 저장하는 기본 요소                         |
| 루트 노드 (Root Node)         | 트리의 가장 윗부분에 위치하는 노드                           |
| 레벨 (Level)                  | 최상위 노드를 Level 0으로 하였을 때 , 하위 Branch로 연결된 노드의 깊이를 나타냄 |
| 부모 노드 (Parent Node)       | - 어떤 노드에서 가지로 연결된 위쪽 노드<br />- 노드는 1개의 부모를 가짐<br />- 루트 노드는 부모를 가질 수 없음 |
| 자식 노드 (Child Node)        | 어떤 노드로 부터 가지로 연결된 아래쪽 노드<br />- 노드는 자식을 여러개 가질 수 있음<br />- 리프 노드는 자식을 가질 수 없음 |
| 리프 노드 (Leaf Node)         | 자식 노드 (Child Node)가 하나도 없는 노드<br />-  끝 노드 (Terminal Node), 바깥 노드 (External Node) 라고도 불림 |
| 형제 노드 ( Brother Node)     | 동일한 Parent Node를 가진 노드<br />-  형제 (Sibling) 라고도 불림 |
| 깊이 (Depth)                  | 트리 (Tree)에서 노드 (Node)가 가질 수 있는 최대 Level        |
| 조상 노드 (Ancestor Node)     | 어떤 노드에서 가지로 연결된 모든 위쪽 노드                   |
| 자손 노드 (Descendant Node)   | 어떤 노드에서 가지로 연결된 모든 아래쪽 노드                 |
| 차수 (Degree)                 | 노드가 갖는 자식의 수                                        |
| 서브 트리 (SubTree)           | 트리 안에서 다시 어떤 노드를 루트로 정하고 그 자손으로 이루어진 트리 |
| 널 트리 (Null Tree)           | 가지가 없는 트리                                             |
| 순서 트리 (Ordered Tree)      | 형제 노드의 순서를 따지는 트리                               |
| 무 순서 트리 (Unordered Tree) | 형제 노드의 순서를 따지지 않는 트리                          |



#### 순서 트리 탐색

- 너비 우선 탐색 (Breadth-First Search)

> 낮은 레벨에서 시작해 왼쪽에서 오른쪽 방향으로 검색하고 한 레벨에서 검색이 끝나면 다음 레벨로 내려감



- 깊이 우선 탐색 (Depth-First Search)

> 리프까지 내려가면서 검색하는 것을 우선순위로 하는 탐색 방법.
>
> 리프에 도달해 더 이상 검색을 진행할 곳이 없는 경우에 부모에게 돌아감
>
> - 전위 순회 (Preorder)  : 노드 방문 --> 왼쪽 자식 --> 오른쪽 자식
> - 중위 순회 (Inorder) : 왼쪽 자식 --> 노드 방문 --> 오른쪽 자식
> - 후위 순회 (Postorder) : 왼쪽 자식 --> 오른쪽 자식 --> 노드 방문

