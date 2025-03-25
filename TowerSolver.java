
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        // Call the missing solve method (not this one)
        solve(model.height(), 0, 2, 1);
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //
    private void solve(int n, int start, int end, int temporary) {
        if (n == 1) {
            model.move(start, end);
            return;
        }
        solve(n - 1, start, end, temporary);

        model.move(start, end);

        solve(n - 1, temporary, end, start);
    }

}
