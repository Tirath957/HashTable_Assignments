import usernamechecker.UsernameAvailabilityChecker;
import inventorymanager.FlashSaleInventoryManager;
import dnscache.DNSCache;
import plagiarism.PlagiarismDetector;
import analytics.AnalyticsDashboard;
import ratelimiter.RateLimiter;
import autocomplete.AutocompleteSystem;
import parking.ParkingLotManager;
import twosum.TwoSumFraudDetector;
import multilevelcache.MultiLevelCacheSystem;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Problem 1: Username Checker =====");
        UsernameAvailabilityChecker checker = new UsernameAvailabilityChecker();
        checker.registerUser("john_doe",1);
        System.out.println(checker.checkAvailability("john_doe"));
        System.out.println(checker.suggestAlternatives("john_doe"));


        System.out.println("\n===== Problem 2: Flash Sale Inventory =====");
        FlashSaleInventoryManager manager = new FlashSaleInventoryManager();
        manager.addProduct("IPHONE15",2);
        System.out.println(manager.purchaseItem("IPHONE15"));
        System.out.println(manager.purchaseItem("IPHONE15"));
        System.out.println(manager.purchaseItem("IPHONE15"));


        System.out.println("\n===== Problem 3: DNS Cache =====");
        DNSCache cache = new DNSCache();
        cache.addEntry("google.com","172.217.14.206",5000);
        System.out.println(cache.resolve("google.com"));


        System.out.println("\n===== Problem 4: Plagiarism Detector =====");
        PlagiarismDetector detector = new PlagiarismDetector();
        detector.indexDocument("doc1","this is a simple plagiarism detection test example");


        System.out.println("\n===== Problem 5: Analytics Dashboard =====");
        AnalyticsDashboard dashboard = new AnalyticsDashboard();
        dashboard.processEvent("/home","user1");
        dashboard.processEvent("/home","user2");


        System.out.println("\n===== Problem 6: Rate Limiter =====");
        RateLimiter limiter = new RateLimiter();
        System.out.println(limiter.checkLimit("client1"));


        System.out.println("\n===== Problem 7: Autocomplete System =====");
        AutocompleteSystem auto = new AutocompleteSystem();
        auto.addQuery("java tutorial");
        auto.addQuery("javascript guide");
        System.out.println(auto.search("jav"));


        System.out.println("\n===== Problem 8: Parking Lot =====");
        ParkingLotManager parking = new ParkingLotManager();
        parking.parkVehicle("ABC123",1);
        parking.exitVehicle("ABC123");


        System.out.println("\n===== Problem 9: Two Sum Fraud Detector =====");
        TwoSumFraudDetector twoSum = new TwoSumFraudDetector();
        int[] arr = {200,300,500};
        System.out.println(twoSum.findTwoSum(arr,500));


        System.out.println("\n===== Problem 10: Multi Level Cache =====");
        MultiLevelCacheSystem cacheSystem = new MultiLevelCacheSystem();
        System.out.println(cacheSystem.get("video1"));

    }
}