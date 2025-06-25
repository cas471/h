// File: TaxiWebsite.java
// Simple standalone Taxi landing page using SparkJava (https://sparkjava.com)
// ---------------------------------------------------------------
// • Start with:  mvn exec:java  (after adding SparkJava to your pom.xml)
// • Opens http://localhost:8080  – Single‑page site incl. German Impressum.
// • Replace the placeholder images (🔄) and company data in the Impressum.
// ---------------------------------------------------------------

import static spark.Spark.*;

public class TaxiWebsite {
    public static void main(String[] args) {
        port(8080); // ▶ Change port if needed

        get("/", (req, res) -> {
            res.type("text/html;charset=UTF-8");
            return """
<!DOCTYPE html>
<html lang=\"de\">
<head>
  <meta charset=\"UTF-8\" />
  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />
  <title>CityCab – Taxi‑Service</title>
  <!-- Tailwind CDN for quick styling (no build step) -->
  <script src=\"https://cdn.tailwindcss.com\"></script>
  <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />
  <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />
  <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;600;800&display=swap\" rel=\"stylesheet\" />
  <style>body{font-family:'Inter',sans-serif}</style>
</head>
<body class=\"bg-gradient-to-b from-yellow-50 via-white to-gray-100 min-h-screen flex flex-col text-gray-800\">

  <!-- ░░░ Header ░░░ -->
  <header class=\"sticky top-0 z-50 backdrop-blur bg-white/70 shadow-sm\">
    <nav class=\"max-w-6xl mx-auto flex items-center justify-between p-4\">
      <div class=\"flex items-center gap-2 text-xl font-bold text-yellow-600\">
        <svg xmlns=\"http://www.w3.org/2000/svg\" class=\"h-6 w-6\" fill=\"none\" viewBox=\"0 0 24 24\" stroke=\"currentColor\" stroke-width=\"2\"><path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M3 13l2-2m0 0l7-7 7 7m-7-7v18\" /></svg>
        CityCab
      </div>
      <ul class=\"hidden md:flex gap-6 text-sm font-medium\">
        <li><a href=\"#services\" class=\"hover:text-yellow-600\">Services</a></li>
        <li><a href=\"#gallery\" class=\"hover:text-yellow-600\">Gallery</a></li>
        <li><a href=\"#booking\" class=\"hover:text-yellow-600\">Book Now</a></li>
        <li><a href=\"#impressum\" class=\"hover:text-yellow-600\">Impressum</a></li>
      </ul>
      <a href=\"#booking\" class=\"md:hidden bg-yellow-600 text-white px-4 py-2 rounded-lg text-sm\">Book Now</a>
    </nav>
  </header>

  <!-- ░░░ Hero ░░░ -->
  <section class=\"flex flex-1 items-center justify-center py-16 px-4 text-center bg-[url('https://images.unsplash.com/photo-1597000091342-9f6502c98e97?auto=format&fit=crop&w=1200&q=60')] bg-cover bg-center relative\">
    <div class=\"absolute inset-0 bg-black/40\"></div>
    <div class=\"relative z-10 max-w-3xl\">
      <h1 class=\"text-4xl md:text-6xl font-extrabold text-white drop-shadow-lg mb-6\">Schnell &amp; zuverlässig ans Ziel</h1>
      <p class=\"text-lg md:text-2xl text-white/90 mb-8\">24/7 Taxi‑Service in Ihrer Stadt – einfach buchen und entspannt ankommen.</p>
      <a href=\"#booking\" class=\"text-lg px-8 py-4 bg-yellow-600 hover:bg-yellow-700 text-white rounded-xl font-semibold\">Jetzt Fahrt buchen</a>
    </div>
  </section>

  <!-- ░░░ Services ░░░ -->
  <section id=\"services\" class=\"max-w-6xl mx-auto py-20 px-4\">
    <h2 class=\"text-3xl md:text-4xl font-bold text-center mb-12\">Unsere Leistungen</h2>
    <div class=\"grid gap-8 md:grid-cols-3\">
      <div class=\"flex flex-col items-center text-center p-8 bg-white rounded-2xl shadow\">
        <!-- SVG icon -->
        <svg xmlns=\"http://www.w3.org/2000/svg\" class=\"h-12 w-12 text-yellow-600 mb-4\" fill=\"none\" viewBox=\"0 0 24 24\" stroke=\"currentColor\" stroke-width=\"2\"><path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M3 13l2-2m0 0l7-7 7 7m-7-7v18\" /></svg>
        <h3 class=\"text-xl font-semibold mb-2\">Stadtrundfahrten</h3>
        <p>Entdecken Sie die Highlights der Stadt mit unseren ortskundigen Fahrern.</p>
      </div>
      <div class=\"flex flex-col items-center text-center p-8 bg-white rounded-2xl shadow\">
        <svg xmlns=\"http://www.w3.org/2000/svg\" class=\"h-12 w-12 text-yellow-600 mb-4\" fill=\"none\" viewBox=\"0 0 24 24\" stroke=\"currentColor\" stroke-width=\"2\"><path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M12 8v4l3 3\" /></svg>
        <h3 class=\"text-xl font-semibold mb-2\">24/7 Verfügbarkeit</h3>
        <p>Tag &amp; Nacht erreichbar – auch an Wochenenden und Feiertagen.</p>
      </div>
      <div class=\"flex flex-col items-center text-center p-8 bg-white rounded-2xl shadow\">
        <svg xmlns=\"http://www.w3.org/2000/svg\" class=\"h-12 w-12 text-yellow-600 mb-4\" fill=\"none\" viewBox=\"0 0 24 24\" stroke=\"currentColor\" stroke-width=\"2\"><path stroke-linecap=\"round\" stroke-linejoin=\"round\" d=\"M5 13l4 4L19 7\" /></svg>
        <h3 class=\"text-xl font-semibold mb-2\">Sichere Fahrten</h3>
        <p>Regelmäßig geprüfte Fahrzeuge und erfahrene Fahrer für Ihre Sicherheit.</p>
      </div>
    </div>
  </section>

  <!-- ░░░ Gallery ░░░ -->
  <section id=\"gallery\" class=\"bg-gray-50 py-20 px-4\">
    <h2 class=\"text-3xl md:text-4xl font-bold text-center mb-12\">Impressionen</h2>
    <div class=\"max-w-6xl mx-auto grid gap-6 grid-cols-1 sm:grid-cols-2 md:grid-cols-4\">
      <!-- 🔄 Replace the src URLs below with your own images -->
      <img src=\"https://source.unsplash.com/random/800x600/?taxi,city\" alt=\"Taxi 1\" class=\"rounded-2xl shadow-md object-cover w-full h-44 md:h-52\">
      <img src=\"https://source.unsplash.com/random/800x600/?cab,driver\" alt=\"Taxi 2\" class=\"rounded-2xl shadow-md object-cover w-full h-44 md:h-52\">
      <img src=\"https://source.unsplash.com/random/800x600/?taxi,night\" alt=\"Taxi 3\" class=\"rounded-2xl shadow-md object-cover w-full h-44 md:h-52\">
      <img src=\"https://source.unsplash.com/random/800x600/?taxi,airport\" alt=\"Taxi 4\" class=\"rounded-2xl shadow-md object-cover w-full h-44 md:h-52\">
    </div>
  </section>

  <!-- ░░░ Booking ░░░ -->
  <section id=\"booking\" class=\"max-w-4xl mx-auto py-20 px-4\">
    <h2 class=\"text-3xl md:text-4xl font-bold text-center mb-8\">Fahrt buchen</h2>
    <div class=\"bg-white shadow-xl rounded-2xl p-8\">
      <form class=\"grid gap-6\" onsubmit=\"event.preventDefault(); alert('Danke für Ihre Anfrage!');\">
        <div class=\"grid gap-2\">
          <label class=\"font-medium\" for=\"name\">Name</label>
          <input id=\"name\" required placeholder=\"Max Mustermann\" class=\"border rounded-lg p-3\" />
        </div>
        <div class=\"grid gap-2 md:grid-cols-2\">
          <div class=\"grid gap-2\">
            <label class=\"font-medium\" for=\"pickup\">Abholort</label>
            <input id=\"pickup\" required placeholder=\"Münchner Str. 1\" class=\"border rounded-lg p-3\" />
          </div>
          <div class=\"grid gap-2\">
            <label class=\"font-medium\" for=\"dropoff\">Zielort</label>
            <input id=\"dropoff\" required placeholder=\"Hauptbahnhof\" class=\"border rounded-lg p-3\" />
          </div>
        </div>
        <div class=\"grid gap-2 md:grid-cols-2\">
          <div class=\"grid gap-2\">
            <label class=\"font-medium\" for=\"date\">Datum</label>
            <input id=\"date\" required type=\"date\" class=\"border rounded-lg p-3\" />
          </div>
          <div class=\"grid gap-2\">
            <label class=\"font-medium\" for=\"time\">Uhrzeit</label>
            <input id=\"time\" required type=\"time\" class=\"border rounded-lg p-3\" />
          </div>
        </div>
        <div class=\"grid gap-2\">
          <label class=\"font-medium\" for=\"phone\">Telefon</label>
          <input id=\"phone\" required type=\"tel\" placeholder=\"0151 123456\" class=\"border rounded-lg p-3\" />
        </div>
        <button type=\"submit\" class=\"w-full md:w-auto mx-auto px-10 py-4 text-lg bg-yellow-600 hover:bg-yellow-700 text-white rounded-xl\">Fahrt anfragen</button>
      </form>
    </div>
  </section>

  <!-- ░░░ Impressum ░░░ -->
  <section id=\"impressum\" class=\"max-w-4xl mx-auto py-20 px-4\">
    <h2 class=\"text-3xl md:text-4xl font-bold text-center mb-8\">Impressum</h2>
    <div class=\"space-y-2 text-sm md:text-base\">
      <!-- ▼▼▼ ERSETZE DIESE ANGABEN DURCH DEINE ECHTEN FIRMENDATEN ▼▼▼ -->
      <p><strong>CityCab GmbH</strong></p>
      <p>Musterstraße 1<br>12345 Musterstadt<br>Deutschland</p>
      <p>Telefon: 01234 567890<br>E‑Mail: info@citycab.de</p>
      <p>Geschäftsführer: Max Mustermann</p>
      <p>Handelsregister: HRB 12345 · Amtsgericht Musterstadt</p>
      <p>Umsatzsteuer‑Identifikationsnummer gemäß § 27a UStG: DE123456789</p>
      <p>Inhaltlich verantwortlich nach § 55 Abs. 2 RStV: Max Mustermann (Anschrift wie oben)</p>
      <!-- ▲▲▲ BIS HIER ÄNDERN ▲▲▲ -->
    </div>
  </section>

  <!-- ░░░ Footer ░░░ -->
  <footer class=\"mt-auto bg-gray-800 text-gray-200 py-8 text-center text-sm\">
    &copy; <span id=\"year\"></span> CityCab – Alle Rechte vorbehalten.
  </footer>

  <script>document.getElementById('year').textContent = new Date().getFullYear();</script>
</body>
</html>
""";
        });
    }
}
