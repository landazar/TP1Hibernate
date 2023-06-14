<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/WEB-INF/css/style.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<title>Afficher un vol</title>
</head>
<body>
	<%@ include file="/WEB-INF/menu.jsp"%>
	<h1>Vols disponibles</h1>

	<section style="background-color: #eee;">
		<div class="text-center container py-5">
			<c:forEach var="i" begin="0" end="${ listeV.size() - 1 }" step="3">
			
				<div class="row">

					<c:if test="${ i <= listeV.size() - 1 }">
						<div class="col-lg-4 col-md-12 mb-4">
							<div class="card">
								<div
									class="bg-image hover-zoom ripple ripple-surface ripple-surface-light"
									data-mdb-ripple-color="light">
									<img
										src="https://static.vecteezy.com/ti/vecteur-libre/p3/4879681-icone-d-un-avion-decollage-gratuit-vectoriel.jpg"
										class="w-100" />
									<div class="mask">
										<div
											class="d-flex justify-content-start align-items-end h-100">
											<h5>
												<span class="badge bg-primary ms-2"><c:out value="${ listeV.get(i).idVol }" /></span>
											</h5>
										</div>
									</div>
									<div class="hover-overlay">
										<div class="mask"
											style="background-color: rgba(251, 251, 251, 0.15);"></div>
									</div>
								</div>
								<div class="card-body">
<%-- 									<p class="card-title mb-3"><c:out value="${ listeV.get(i).getListeCompagnie().get(i).nom }" /></p> --%>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i).getAeroportDepart().getNom() }" /></span>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i).getAeroportDepart().getVille().getNom() }" /></span>
									<p>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i).getDateDepart() }" /></span>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i).getHeureDepart() }" /></span>
									</p>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i).getAeroportArrivee().getNom() }" /></span>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i).getAeroportArrivee().getVille().getNom() }" /></span>
									<p>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i).getDateArrivee() }" /></span>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i).getHeureArrivee() }" /></span>
									</p>
								</div>
							</div>
						</div>
					</c:if>
					<c:if test="${ i + 1 <= listeV.size() - 1 }">
						<div class="col-lg-4 col-md-12 mb-4">
							<div class="card">
								<div
									class="bg-image hover-zoom ripple ripple-surface ripple-surface-light"
									data-mdb-ripple-color="light">
									<img
										src="https://static.vecteezy.com/ti/vecteur-libre/p3/4879681-icone-d-un-avion-decollage-gratuit-vectoriel.jpg"
										class="w-100" />
									<div class="mask">
										<div
											class="d-flex justify-content-start align-items-end h-100">
											<h5>
												<span class="badge bg-primary ms-2"><c:out value="${ listeV.get(i + 1).idVol }" /></span>
											</h5>
										</div>
									</div>
									<div class="hover-overlay">
										<div class="mask"
											style="background-color: rgba(251, 251, 251, 0.15);"></div>
									</div>
								</div>
								<div class="card-body">
<%-- 									<p class="card-title mb-3"><c:out value="${ listeV.get(i + 1).getListeCompagnie().get(i).nom }" /></p> --%>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i + 1).getAeroportDepart().getNom() }" /></span>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i + 1).getAeroportDepart().getVille().getNom() }" /></span>
									<p>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i + 1).getDateDepart() }" /></span>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i + 1).getHeureDepart() }" /></span>
									</p>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i + 1).getAeroportArrivee().getNom() }" /></span>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i + 1).getAeroportArrivee().getVille().getNom() }" /></span>
									<p>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i + 1).getDateArrivee() }" /></span>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i + 1).getHeureArrivee() }" /></span>
									</p>
								</div>
							</div>
						</div>
					</c:if>
					<c:if test="${ i + 2 <= listeV.size() - 1 }">
						<div class="col-lg-4 col-md-12 mb-4">
							<div class="card">
								<div
									class="bg-image hover-zoom ripple ripple-surface ripple-surface-light"
									data-mdb-ripple-color="light">
									<img
										src="https://static.vecteezy.com/ti/vecteur-libre/p3/4879681-icone-d-un-avion-decollage-gratuit-vectoriel.jpg"
										class="w-100" />
									<div class="mask">
										<div
											class="d-flex justify-content-start align-items-end h-100">
											<h5>
												<span class="badge bg-primary ms-2"><c:out value="${ listeV.get(i + 2).idVol }" /></span>
											</h5>
										</div>
									</div>
									<div class="hover-overlay">
										<div class="mask"
											style="background-color: rgba(251, 251, 251, 0.15);"></div>
									</div>
								</div>
								<div class="card-body">
<%-- 									<p class="card-title mb-3"><c:out value="${ listeV.get(i + 2).getListeCompagnie().get(i).nom }" /></p> --%>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i + 2).getAeroportDepart().getNom() }" /></span>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i + 2).getAeroportDepart().getVille().getNom() }" /></span>
									<p>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i + 2).getDateDepart() }" /></span>
											<span class="card-title mb-3"><c:out value="${ listeV.get(i + 2).getHeureDepart() }" /></span>
									</p>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i + 2).getAeroportArrivee().getNom() }" /></span>
									<span class="card-title mb-3"><c:out value="${ listeV.get(i + 2).getAeroportArrivee().getVille().getNom() }" /></span>
									<p>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i + 2).getDateArrivee() }" /></span>
										<span class="card-title mb-3"><c:out value="${ listeV.get(i + 2).getHeureArrivee() }" /></span>
									</p>
								</div>
							</div>
						</div>
					</c:if>
				</div>
			</c:forEach>
		</div>
	</section>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-DZ8i3Y5sR6aaQBBfRc6HydNmmF2t8DGxOnBsADxnn9iVZapvH/Tp+3JgTQIz9IIu"
		crossorigin="anonymous"></script>
</body>
</html>
