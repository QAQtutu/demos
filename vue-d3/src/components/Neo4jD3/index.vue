<template>
  <div class="neo4jd3" id="app"></div>
</template>

<script>
import Neo4jD3 from "@/neo4jd3";
import "@/neo4jd3/style.css";
export default {
  data() {
    return {
      nodes: [
        {
          id: "1",
          icon: "User",
          labels: ["Node-1"],
          properties: {},
        },
      ],
      edges: [],
      maxNodeId: 1,
      maxEdgeId: 0,
      graph: null,
    };
  },
  mounted() {
    this.graph = new Neo4jD3("#app", {
      arrowSize: 7.5,
      relationshipWidth: 1.5,
      nodeRadius: 23,
      nodeCaption: true,
      relationshipCaption: true,
      icons: {
        Tweet: "fab fa-twitter",
        User: "fas fa-street-view",
        Hashtag: "fas fa-hashtag",
      },
      colors: { Tweet: "#00acee", User: "#54ca74", Hashtag: "#796EFF" },
      onNodeDBClick: this.expandNode,
    });

    this.drawGraph();
  },
  methods: {
    drawGraph() {
      this.graph.drawGraph({
        nodes: this.nodes,
        relationships: this.edges,
      });
    },
    expandNode(node) {
        console.log(node)
      const nodeId = ++this.maxNodeId + "";
      const newNode = {
        id: nodeId,
        labels: ["Node-" + nodeId],
        icon: "User",
        x:node.x,
        y:node.y,
        properties: {},
      };

      const edgeId = ++this.maxEdgeId + "";
      const newEdge = {
        id: edgeId,
        type: "Edge-" + nodeId + "-" + node.id,
        startNode: nodeId,
        endNode: node.id,
        properties: {
          from: 1473581532586,
        },
      };

      this.nodes.push(newNode);
      this.edges.push(newEdge);

      this.drawGraph();
    },
  },
};
</script>

<style>
.neo4jd3 {
  width: 100vw;
  height: 100vh;
}
</style>