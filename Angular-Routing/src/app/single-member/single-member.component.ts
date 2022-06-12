import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-single-member',
  templateUrl: './single-member.component.html',
  styleUrls: ['./single-member.component.css']
})
export class SingleMemberComponent implements OnInit {

  memberId: number = 0;

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    //extract the new memberId from the URL
    this.route.url.subscribe(() => {
      this.memberId = +this.route.snapshot.params['member'];
    })

  }

}
